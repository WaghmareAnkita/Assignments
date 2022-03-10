package jdbc;


	public class MainClass {

		public static void main(String[] args) {
			JdbcExample j = new JdbcExample();

			// Inserting one customer
			j.insertCustomer(003, "Karan", "Pune", 3457, 45000);

			// Inserting 5 customer
			j.insertCustomer(004, "Shreya", "Akola", 5679, 7800);

			j.insertCustomer(005, "Ram", "Mumbai", 4567, 34000);

			j.insertCustomer(006, "Mansi", "Nanded", 5679, 60800);

			j.insertCustomer(007, "Swati", "Pune", 8766, 50800);

			j.insertCustomer(010, "Rakhi", "Bhopal", 1267, 8000);

			// update the balance

			j.updateBalance(004, 65000);

			// Delete the Row
			j.delete(004);

			// List the Customer
			j.getCustomerDetails();

			// Get customer details with id
			j.getCustomerWithId(002);

		}

	}



