package com.performance.module_2_154

class Feature154UseCase0(
    private val repository: Feature154Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
