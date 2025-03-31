package com.performance.module_1_154

class Feature154UseCase2(
    private val repository: Feature154Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
