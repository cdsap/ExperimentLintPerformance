package com.performance.module_2_226

class Feature226UseCase2(
    private val repository: Feature226Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
