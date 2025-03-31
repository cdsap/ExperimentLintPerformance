package com.performance.module_1_154

class Feature154UseCase0(
    private val repository: Feature154Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
