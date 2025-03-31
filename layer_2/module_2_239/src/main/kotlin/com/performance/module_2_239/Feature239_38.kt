package com.performance.module_2_239

class Feature239UseCase2(
    private val repository: Feature239Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
