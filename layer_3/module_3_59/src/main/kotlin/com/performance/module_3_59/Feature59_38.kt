package com.performance.module_3_59

class Feature59UseCase2(
    private val repository: Feature59Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
