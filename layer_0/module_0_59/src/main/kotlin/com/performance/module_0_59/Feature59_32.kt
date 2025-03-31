package com.performance.module_0_59

class Feature59UseCase0(
    private val repository: Feature59Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
