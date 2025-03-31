package com.performance.module_2_239

class Feature239UseCase1(
    private val repository: Feature239Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
