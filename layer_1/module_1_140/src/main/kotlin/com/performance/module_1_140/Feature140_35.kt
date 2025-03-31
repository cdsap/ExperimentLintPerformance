package com.performance.module_1_140

class Feature140UseCase1(
    private val repository: Feature140Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
