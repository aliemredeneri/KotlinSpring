package com.example.kotlinproject.datasource

import com.example.kotlinproject.model.Bank
import org.springframework.stereotype.Repository

@Repository
class NetworkDataSource : BankDataSource {
    override fun retrieveBanks(): Collection<Bank> {
        TODO("Not yet implemented")
    }

    override fun retrieveBanks(accountNumber: String): Bank {
        TODO("Not yet implemented")
    }

    override fun createBank(bank: Bank): Bank {
        TODO("Not yet implemented")
    }

    override fun updateBank(bank: Bank): Bank {
        TODO("Not yet implemented")
    }

    override fun deleteBank(accountNumber: String) {
        TODO("Not yet implemented")
    }


}