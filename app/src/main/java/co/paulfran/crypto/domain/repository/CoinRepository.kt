package co.paulfran.crypto.domain.repository

import co.paulfran.crypto.data.remote.dto.CoinDetailDto
import co.paulfran.crypto.data.remote.dto.CoinDto

/*
 * This class is useful for test cases
 */
interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}