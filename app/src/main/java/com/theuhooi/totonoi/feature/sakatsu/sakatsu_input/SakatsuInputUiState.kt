package com.theuhooi.totonoi.feature.sakatsu.sakatsu_input

import androidx.compose.runtime.Stable
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Stable
data class SakatsuInputUiState(
    val facilityName: String? = null,
    private val visitingDate: LocalDateTime = LocalDateTime.now(),
    val saunaSetList: List<SaunaSet> = listOf(SaunaSet()),
    val description: String? = null
) {
    val visitingDateText: String
        get() = DateTimeFormatter.ofPattern("yyyy/MM/dd").format(visitingDate)

    val isSaveButtonEnabled: Boolean
        get() = facilityName.orEmpty().isNotBlank()
}

data class SaunaSet(
    val saunaTime: String? = null,
    val coolBathTime: String? = null,
    val relaxationTime: String? = null
)