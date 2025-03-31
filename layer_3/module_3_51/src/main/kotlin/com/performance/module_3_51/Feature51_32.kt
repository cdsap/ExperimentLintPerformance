package com.performance.module_3_51

class Feature51UseCase0(
    private val repository: Feature51Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
