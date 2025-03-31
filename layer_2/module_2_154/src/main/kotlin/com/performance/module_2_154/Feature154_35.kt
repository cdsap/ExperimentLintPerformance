package com.performance.module_2_154

class Feature154UseCase1(
    private val repository: Feature154Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
