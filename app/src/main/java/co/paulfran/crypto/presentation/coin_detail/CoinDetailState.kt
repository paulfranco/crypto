package co.paulfran.crypto.presentation.coin_detail

import co.paulfran.crypto.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""

)
