package com.performance.module_3_51

class Feature51UseCase2(
    private val repository: Feature51Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
