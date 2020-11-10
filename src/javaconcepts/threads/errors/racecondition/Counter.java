package javaconcepts.threads.errors.racecondition;

class Counter {
	int count = 0;

	public void increment() {
		count = count + 1;
	}

	public int getCount() {
		return count;
	}
}