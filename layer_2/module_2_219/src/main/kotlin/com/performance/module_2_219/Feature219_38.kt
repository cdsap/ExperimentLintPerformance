package com.performance.module_2_219

class Feature219UseCase2(
    private val repository: Feature219Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
