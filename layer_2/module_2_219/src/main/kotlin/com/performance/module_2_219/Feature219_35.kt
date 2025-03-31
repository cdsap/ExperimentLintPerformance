package com.performance.module_2_219

class Feature219UseCase1(
    private val repository: Feature219Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
