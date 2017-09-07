

import java.util.Arrays;

public class SortArrayByNum {
	private Person[] arrayPerson;

	public SortArrayByNum(Person[] a) {
		copyArray(a);
		sortArrayAsc(arrayPerson);
		outPerson();
	}

	private void copyArray(Person[] a) {
		arrayPerson = Arrays.copyOf(a, a.length);
	}

	private void sortArrayAsc(Person[] a) throws NullPointerException {
		Person x;
		for (int i = 0; i < getLength(); i++) {
			for (int j = getLength() - 1; j > i; j--) {
				try {
					if (a[j - 1] == null && a[j] != null) {
						x = a[j - 1];
						a[j - 1] = a[j];
						a[j] = x;
					}
					if (a[j - 1].getNumber() > a[j].getNumber()) {
						x = a[j - 1];
						a[j - 1] = a[j];
						a[j] = x;
					}
				} catch (Exception e) {
				}
			}
		}
	}

	public Object get(int i) {
			return arrayPerson[i];
	}

	public int getLength() {
		return arrayPerson.length;
	}

	public void outPerson() {
		for (int i = 0; i < getLength(); i++) {
			if (arrayPerson[i] != null) {
				System.out.println(i+ " " + arrayPerson[i].getNumber());
			}
			else System.out.println(i+ " " + "null");
		}
		System.out.println("End");
	}
}
