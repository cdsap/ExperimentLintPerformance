package com.performance.module_3_273

class Feature273UseCase0(
    private val repository: Feature273Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
