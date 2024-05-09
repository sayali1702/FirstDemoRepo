package com.example.DemoBankingApp.service.impl;

import org.springframework.stereotype.Service;

import com.example.DemoBankingApp.dto.AccountDto;
import com.example.DemoBankingApp.entity.Account;
import com.example.DemoBankingApp.mapper.AccountMapper;
import com.example.DemoBankingApp.repository.AccountRepository;
import com.example.DemoBankingApp.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	
	private AccountRepository accountRepository;
	

	public AccountServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}


	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		// TODO Auto-generated method stub
		Account account = AccountMapper.mapToAccount(accountDto);
		Account savedAccount = accountRepository.save(account);
		
		return AccountMapper.mapToAccountDto(savedAccount);
	}

}
