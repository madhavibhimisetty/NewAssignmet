package Sortings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuickSortTest {
	QuickSort QuickSort = new QuickSort();
	@Test
	 public void shouldSortValues() {
		int[] values = { 9, -3, 5, 0, 1};
        int[] expectedOrder = { -3, 0, 1, 5, 9};
        QuickSort.sort(values);
        assertArrayEquals(expectedOrder, values);
	}
}
