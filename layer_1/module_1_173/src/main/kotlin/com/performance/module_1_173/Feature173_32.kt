package com.performance.module_1_173

class Feature173UseCase0(
    private val repository: Feature173Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
