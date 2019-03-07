package lab2.ex2;

public class MobileComputer extends Computer implements Chargable{
		private int battery;
		public MobileComputer() {
			secret = "MobileComputer secret";
			battery = 5;
		}
		@Override
		public void work() {
			if (battery > 0) {
				System.out.println("It is working on a lap.");
				battery--;
			}
			else {
				System.out.println("Running out of battery");
			}
		}
		public void charge() {
			if(battery < 10) {
				battery++;
			}
		}
}
