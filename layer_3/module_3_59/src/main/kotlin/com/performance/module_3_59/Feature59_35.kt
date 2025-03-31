package com.performance.module_3_59

class Feature59UseCase1(
    private val repository: Feature59Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
