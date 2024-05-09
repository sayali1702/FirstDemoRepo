package com.example.DemoBankingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DemoBankingApp.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{

}
