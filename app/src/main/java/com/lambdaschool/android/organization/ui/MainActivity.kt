package com.lambdaschool.android.organization.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.android.organization.R
import com.lambdaschool.android.organization.application.LambdaApplication
import com.lambdaschool.android.organization.model.ProductData
import com.lambdaschool.android.organization.util.DateUtils
import com.lambdaschool.android.organization.util.TextUtils.Companion.formatCurrency
import com.lambdaschool.android.organization.util.TextUtils.Companion.formatPercent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Product Details"
        setContentView(R.layout.activity_main)
        displayProductDetails((application as LambdaApplication).appProduct)
    }

    private fun displayProductDetails(productData: ProductData) {
        // todo: Instantiate a Product, set its characteristics, and
        // set each of the fields on the corresponding TextViews from the layout
        // use the appropriate Util methods for formatting the fields
        orderDate.text = DateUtils.formatDateWithDay(productData.date)
        productName.text = productData.productName
        productDescription.text = productData.productDescription
        productPrice.text = "Price: " + formatCurrency(productData.productPrice)
        productTax.text = "Tax: " + formatCurrency(productData.productTax)
        productDiscount.text = formatPercent(productData.productDiscount)
        totalProductPrice.text = "Total: " + formatCurrency(productData.totalProductPrice)

    }
}
