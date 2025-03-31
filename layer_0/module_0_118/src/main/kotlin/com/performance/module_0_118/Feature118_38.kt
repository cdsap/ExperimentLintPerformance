package com.performance.module_0_118

class Feature118UseCase2(
    private val repository: Feature118Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
