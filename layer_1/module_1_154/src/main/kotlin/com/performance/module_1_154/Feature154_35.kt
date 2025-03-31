package com.performance.module_1_154

class Feature154UseCase1(
    private val repository: Feature154Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
