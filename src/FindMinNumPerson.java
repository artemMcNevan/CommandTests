

/*
 * Function to finds Person by min number in unordered matrix NxN
 */
public class FindMinNumPerson {
	public Person findMinNum(Person[][] a) throws NullPointerException {
		int minNumber = Integer.MAX_VALUE;
		int one = 0;
		int two = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				try {
					if (minNumber > Math.min(minNumber, a[i][j].getNumber())) {
						minNumber = Math.min(minNumber, a[i][j].getNumber());
						one = i;
						two = j;
					}
				} catch (Exception e) {
					break;
				}
			}
		}
		return a[one][two];
	}
}
