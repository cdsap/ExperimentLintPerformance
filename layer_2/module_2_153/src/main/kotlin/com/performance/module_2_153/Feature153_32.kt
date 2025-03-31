package com.performance.module_2_153

class Feature153UseCase0(
    private val repository: Feature153Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
