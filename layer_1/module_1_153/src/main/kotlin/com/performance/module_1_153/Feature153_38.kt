package com.performance.module_1_153

class Feature153UseCase2(
    private val repository: Feature153Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
