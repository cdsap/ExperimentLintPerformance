package com.performance.module_2_206

class Feature206UseCase1(
    private val repository: Feature206Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
