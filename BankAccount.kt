package com.example.bankaccountprogram



class BankAccount(var accountHolder:String,
                  var balance:Double)
{
    private val transactionHistory= mutableListOf<String>()
    fun deposit(amount: Double){
//allows us to put money in to the account
        balance+=amount
        transactionHistory.add("$accountHolder deposited $ $amount")
    }
    fun withdraw(amount:Double){
//allows us to withdraw money from the account
        if(amount<=balance){
            balance-=amount
            transactionHistory.add("$accountHolder withdrew $ $amount")
            println("")
        }else{
            println("You do not have the funds to widthdraw $ $amount")
        }

    }
    fun displayTransactionHIstory(){
        //displays the transaction history
        for(transaction in transactionHistory){
            println("Transaction history for $accountHolder")
            println(transaction)
        }
    }
}