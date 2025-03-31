package com.performance.module_3_273

class Feature273UseCase1(
    private val repository: Feature273Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
