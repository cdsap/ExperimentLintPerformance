package com.performance.module_2_226

class Feature226UseCase0(
    private val repository: Feature226Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
