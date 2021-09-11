package co.paulfran.crypto.data.repository

import co.paulfran.crypto.data.remote.CoinPaprikaApi
import co.paulfran.crypto.data.remote.dto.CoinDetailDto
import co.paulfran.crypto.data.remote.dto.CoinDto
import co.paulfran.crypto.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}