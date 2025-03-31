package com.performance.module_2_219

class Feature219UseCase0(
    private val repository: Feature219Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
