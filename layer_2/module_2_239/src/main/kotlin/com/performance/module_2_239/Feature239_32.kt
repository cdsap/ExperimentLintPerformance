package com.performance.module_2_239

class Feature239UseCase0(
    private val repository: Feature239Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
