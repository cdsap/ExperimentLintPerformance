package com.performance.module_1_173

class Feature173UseCase1(
    private val repository: Feature173Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
