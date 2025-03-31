package com.performance.module_4_296

class Feature296UseCase1(
    private val repository: Feature296Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
