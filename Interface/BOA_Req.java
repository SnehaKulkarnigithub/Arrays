interface BOA_BankAccount
{
	void bankAccount();
}
interface BOA_BankLoans 
{
	void bankLoans();
}
interface BOA_freeInsurance extends BOA_BankAccount,BOA_BankLoans
{
	void bankFreeInsurance();
}