package com.example.bankaccountprogram

fun main(){
    val arionBankAccount=BankAccount("Arion Dutta",100.00)
    arionBankAccount.deposit(200.00)
    arionBankAccount.withdraw(1200.00)
    arionBankAccount.deposit(3000.00)
    arionBankAccount.deposit(2000.00)
    arionBankAccount.withdraw(3333.15)
    arionBankAccount.displayTransactionHIstory()
    println("${arionBankAccount.accountHolder} balance is ${arionBankAccount.balance}")
}