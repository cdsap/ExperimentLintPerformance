package com.performance.module_0_118

class Feature118UseCase1(
    private val repository: Feature118Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
