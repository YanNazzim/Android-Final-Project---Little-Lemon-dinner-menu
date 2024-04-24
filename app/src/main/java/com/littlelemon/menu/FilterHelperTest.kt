package com.littlelemon.menu

import org.junit.Assert.assertEquals
import org.junit.Test

class FilterHelperTest {

    @Test
    fun filterProductsFilterTypeDessertCroissantReturned() {
        // Arrange
        val filterHelper = FilterHelper()
        val sampleProductsList = mutableListOf(
            ProductItem(title = "Black tea", price = 3.00, category = "Drinks", image = R.drawable.black_tea),
            ProductItem(title = "Croissant", price = 7.00, category = "Dessert", image = R.drawable.croissant),
            ProductItem(title = "Bouillabaisse", price = 20.00, category = "Food", image = R.drawable.bouillabaisse)
        )

        // Act
        val filteredList = filterHelper.filterProducts(FilterType.Dessert, sampleProductsList)

        // Assert
        assertEquals(1, filteredList.size)
        assertEquals("Croissant", filteredList[0].title)
        assertEquals("Dessert", filteredList[0].category)
    }
}
