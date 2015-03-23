package methods;


	public class Exit implements Command{
		//when called, the functions returns 0 and exits
		
	@Override
		public void execute(){
			
			System.out.println("Exiting...Done");
			System.exit(0);
		}
}
