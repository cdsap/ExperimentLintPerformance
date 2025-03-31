package com.performance.module_2_153

class Feature153UseCase1(
    private val repository: Feature153Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
