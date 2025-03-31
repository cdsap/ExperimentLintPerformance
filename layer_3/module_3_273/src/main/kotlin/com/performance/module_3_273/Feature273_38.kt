package com.performance.module_3_273

class Feature273UseCase2(
    private val repository: Feature273Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
