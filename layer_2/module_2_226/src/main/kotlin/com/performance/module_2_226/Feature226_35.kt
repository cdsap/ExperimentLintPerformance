package com.performance.module_2_226

class Feature226UseCase1(
    private val repository: Feature226Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
