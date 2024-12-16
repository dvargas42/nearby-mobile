package com.dvargas.nearby.ui.screen.market_details

import com.dvargas.nearby.data.model.Rule

data class MarketDetailsUiState (
    val rules: List<Rule>? = null,
    val coupon: String? = null
)