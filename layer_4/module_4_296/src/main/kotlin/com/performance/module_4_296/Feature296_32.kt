package com.performance.module_4_296

class Feature296UseCase0(
    private val repository: Feature296Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
