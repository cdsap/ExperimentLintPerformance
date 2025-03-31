package com.performance.module_0_34

class Feature34UseCase0(
    private val repository: Feature34Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
