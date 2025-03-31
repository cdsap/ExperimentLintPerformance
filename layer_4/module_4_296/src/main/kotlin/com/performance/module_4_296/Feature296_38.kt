package com.performance.module_4_296

class Feature296UseCase2(
    private val repository: Feature296Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
